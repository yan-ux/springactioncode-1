
import knights.BraveKnight;
import knights.Quest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author dongmei.gao
 * @date 2019/5/17 15:37
 */
public class BraveKnightTest {

   @Test
    public void knightShouldEmbarkOnQuest(){
       Quest questMock = mock(Quest.class);
       BraveKnight knight = new BraveKnight(questMock);
       knight.embarkOnQuest();
       //verify返回T类型为quest,可以看下源码
       verify(questMock,times(1)).embark();
    }
}
