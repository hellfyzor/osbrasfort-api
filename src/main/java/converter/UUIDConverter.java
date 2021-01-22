package converter;

import org.eclipse.persistence.internal.helper.DatabaseField;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.DirectCollectionMapping;
import org.eclipse.persistence.mappings.ManyToOneMapping;
import org.eclipse.persistence.mappings.OneToOneMapping;
import org.eclipse.persistence.sessions.Session;

import org.eclipse.persistence.mappings.converters.Converter;
import java.lang.annotation.Annotation;
import java.sql.Types;
import java.util.UUID;

public class UUIDConverter implements Converter {

    @Override
    public Object convertObjectValueToDataValue(Object objectValue, Session session) {
        return objectValue;
    }

    @Override
    public UUID convertDataValueToObjectValue(Object dataValue, Session session) {
        return (UUID) dataValue;
    }

    @Override
    public boolean isMutable() {
        return true;
    }

//    @Override
//    public void initialize(DatabaseMapping mapping, Session session) {
//        final DatabaseField field;
//        if (mapping instanceof DirectCollectionMapping) {
//            // handle @ElementCollection...
//            field = ((DirectCollectionMapping) mapping).getDirectField();
//        } else {
//            field = mapping.getField();
//        }
//        field.setSqlType(java.sql.Types.OTHER);
//        field.setTypeName("java.util.UUID");
//        field.setColumnDefinition("UUID");
//    }
    
    @Override
    public void initialize(DatabaseMapping ARGMapping, Session ARGSession) {
        final DatabaseField Field;
        if (ARGMapping instanceof DirectCollectionMapping) {
            Field = ((DirectCollectionMapping) ARGMapping).getDirectField();
        } else {
            Field = ARGMapping.getField();
        }
        Field.setSqlType(Types.OTHER);
        Field.setTypeName("java.util.UUID");
        Field.setColumnDefinition("UUID");

        for (DatabaseMapping m : ARGMapping.getDescriptor().getMappings()) {
            assert OneToOneMapping.class.isAssignableFrom(ManyToOneMapping.class);
            if (m instanceof OneToOneMapping) {
                for (DatabaseField field : ((OneToOneMapping) m).getForeignKeyFields()) {
                    field.setSqlType(Types.OTHER);
                    field.setColumnDefinition("UUID");
                    field.setTypeName("java.util.UUID");
                }
            }
        }
    }
}
