package knights;

import java.io.PrintStream;

/**
 * @author dongmei.gao
 * @date 2019/5/20 10:36
 */
public class SalaryDragonQuest implements Quest{
    private PrintStream stream;

    public SalaryDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
      stream.print("embarking on quest to salary dragon ");
    }
}
