package Student;

/*generic class*/
class Info <X> {
    private X data;
    public void set(X data) {
        this.data = data;
    }
    public X get () {
        return this.data;
    }
}

/*generic interface*/
interface IdAndValue<K extends Comparable<K>,V>{
    public void setKey(K key);
    public void setValue(V value);

    public K getKey();
    public V getValue();
}

/*generic bound type parameter*/
class Item<K extends Comparable<K>, V> implements IdAndValue<K,V> {
    private Info<K> key;
    private Info<V> value;

    public Item(K key, V value) {
        this.key = new Info<K>();
        this.value = new Info<V>();
        this.setKey(key);
        this.setValue(value);
    }

    @Override
    public void setKey(K key) {
        // TODO Auto-generated method stub
        this.key.set(key);
    }

    @Override
    public void setValue(V value) {
        // TODO Auto-generated method stub
        this.value.set(value);
    }

    @Override
    public K getKey() {
        // TODO Auto-generated method stub
        return this.key.get();
    }
    @Override
    public V getValue() {
        // TODO Auto-generated method stub
        return this.value.get();
    }

}
