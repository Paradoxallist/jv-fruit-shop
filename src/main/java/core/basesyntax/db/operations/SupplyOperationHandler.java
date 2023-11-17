package core.basesyntax.db.operations;

import core.basesyntax.db.dao.StorageDao;
import core.basesyntax.model.Item;
import core.basesyntax.model.ItemTransaction;

public class SupplyOperationHandler implements DataOperation {
    @Override
    public void handle(ItemTransaction transaction) {
        dao.supply(item);
    }
}
