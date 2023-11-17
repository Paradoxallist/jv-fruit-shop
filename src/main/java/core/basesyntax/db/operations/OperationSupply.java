package core.basesyntax.db.operations;

import core.basesyntax.db.dao.StorageDao;
import core.basesyntax.model.Item;

public class OperationSupply implements DataOperation {
    @Override
    public void handle(Item item, StorageDao dao) {
        dao.supply(item);
    }
}
