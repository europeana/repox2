package pt.utl.ist.dataProvider.dataSource;

import org.dom4j.Element;

import pt.utl.ist.recordPackage.RecordRepox;

/**
 */
public interface RecordIdPolicy {

    /**
     * Create a RecordRepox from a dom representation and an id (id may be null
     * if it can be extracted) If forceId is set to true, the id of the Record
     * is recordId. Otherwise, if the id is extracted from the Record, the
     * parameter is ignored.
     * 
     * @param recordElement
     * @param recordId
     * @param forceId
     * @param isDeleted
     * @return RecordRepox
     * @throws Exception
     */
    RecordRepox createRecordRepox(Element recordElement, String recordId, boolean forceId, boolean isDeleted) throws Exception;
}
