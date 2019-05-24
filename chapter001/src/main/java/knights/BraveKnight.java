package knights;

/**
 * 勇敢的骑士
 * @author dongmei.gao
 * @date 2019/5/17 15:23
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    public void embarkOnQuest() {
        quest.embark();
    }
}
