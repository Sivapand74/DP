package IteratorDP;

public class NameRepository implements Container {
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator1 getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator1 {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];

			}
			return null;
		}
	}
}