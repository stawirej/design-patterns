package template;

import java.sql.Connection;
import java.util.function.Consumer;

abstract class Template {

//    public void store(
//            Connection connection,
//            Consumer<Data> consumer) {
//
//        try {
//            connection.setAutoCommit(false);
//            save(data);
//            consumer.accept(data);
//            updateIndexes();
//            connection.commit();
//        } catch (Exception exception) {
//            connection.rollback();
//            handleException(exception);
//        } finally {
//            connection.setAutoCommit(true);
//        }
//
//    }

    protected abstract void handleException(Exception exception);

    protected abstract void updateIndexes();

    protected abstract void save(Data data);

}
