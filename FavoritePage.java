import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

public class FavoritePage {
  private SelenideElement pageTitle = $(Selectors.byText("Избранное"));
  private SelenideElement mainLink = 
$(Selectors.byXpath("//a[@href='/kvartiry/1-k._kvartira_34m_510et._3287600076']"));

  public FavoritePage checkVisibleFavoritePage() {
    pageTitle.shouldBe(Condition.visible);
    return this;
  }

  public void checkAdVisible() {
    mainLink.shoudBe(Condition.visible);
  }
  

  
  
}
