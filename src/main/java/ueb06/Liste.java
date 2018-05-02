package ueb06;

class Liste<T> {
	private class Element {
		T value;
		Element next;
		Element(T value) { this.value = value; }
	}

	private Element first;

	/**
	 * Hängt ein Element hinten an die Liste an.
	 */
	void add(T value) {
		if (first == null) {
			first = new Element(value);
			return;
		}

		Element it = first;
		while (it.next != null)
			it = it.next;

		it.next = new Element(value);
	}

	/**
	 * Wie `add`, aber rekursiv zu implementieren.
	 */
	void addRek(T value) {
        if (first == null) {
            first = new Element(value);
            return;
        }
        Element it = first;
        addRek(value, it);
	}

    void addRek(T value, Element it) {
	    if (it.next == null) {
	        it.next = new Element(value);
        } else {
	        it = it.next;
            addRek(value, it);
        }
    }

	/**
	 * Gibt `true` zurück, wenn der Wert `value` in der Liste enthalten ist.
	 */
	boolean contains(T value) {
		if (first == null)
			return false;
		Element it = first;

		while (it != null) {
			if (it.value.equals(value))
				return true;
			it = it.next;
		}

		return false;
	}

	/**
	 * Wie `contains`, nur rekursiv zu implementieren.
	 */
	boolean containsRek(T value) {
        if (first == null)
            return false;
        Element it = first;

        return containsRek(value, it);
	}

    boolean containsRek(T value, Element it) {
        if (it.value == value) {
            return true;
        } else if (it.next == null) {
	        return false;
        } else {
	        return containsRek(value, it.next);
        }
    }



	/**
	 * Gibt eine Stringrepraesentation der Liste zurück, z.B. [] oder [1, 2, 3]
	 */
	public String toString() {
		if (first == null)
			return "[]";

		StringBuilder sb = new StringBuilder();
		sb.append("[").append(first.value);

		Element it = first.next;
		while (it != null) {
			sb.append(", ").append(it.value);
			it = it.next;
		}

		return sb.append("]").toString();
	}

	/**
	 * Zusatzaufgabe: Wie `toString`, nur rekursiv zu implementieren.
	 */
	String toStringRek() {
        //Noch nicht fertig...
	    if (first == null)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(first.value);

        Element it = first.next;

        return sb.toString();
	}

}
