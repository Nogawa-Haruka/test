
public interface Mp3Player {
		public abstract void play();
		public abstract void stop();
		public abstract void next();
		public abstract void back();
		default void back2(){
			System.out.println("戻る2");
		}

	}
