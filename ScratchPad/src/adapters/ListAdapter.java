package adapters;

public class ListAdapter implements BetaList {
    private AlphaList list;

    ListAdapter(AlphaList list) {
        this.list = list;
    }

    @Override
    public int getValue(int index) {
        return list.get(index);
    }

    @Override
    public void setValue(int index, int value) {
        list.set(index, value);
    }

    @Override
    public int getSize() {
        return list.count();
    }

    @Override
    public void setSize(int newSize) {
        if (newSize > list.count()) {
            while (list.count() < newSize) {
                list.add(0);
            }
        }
        else if (newSize < list.count()) {
            while (list.count() > newSize) {
                list.remove(list.count() - 1);
            }
        }
    }

}
