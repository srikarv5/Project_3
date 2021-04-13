import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestFrontend {
	
	@BeforeEach
	public void createGraph(){
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend fe = new Frontend();
	}
	
	@Test
	public  void test1() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		
		Frontend.do1(UWmap);
		
	}
	@Test
	public  void test2() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend.menu();
	}
	@Test
	public  void test3() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend.do2(UWmap);
	}
	@Test
	public  void test4() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend.do3(UWmap);
	}
	@Test
	public  void test5() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend.do4(UWmap);
	}
	@Test
	public  void test6() {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		Frontend.do5(UWmap);
	}
	
	
}
