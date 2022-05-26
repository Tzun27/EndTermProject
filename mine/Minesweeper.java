package mine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Minesweeper extends Application{

	public static Board board = new Board();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		board.scene = new Scene(board.init_board());
		
		stage.setScene(board.scene);
		stage.show();
	}

}
