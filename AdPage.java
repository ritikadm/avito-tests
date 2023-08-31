import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import org.openqa.selenium.By.ByXPath;

public class AdPage {
  private SelenideElement title = 
$(byXPath("//span[@class='title-info-title-text']"));
  private SelenideElement addToFavoriteButton = $(byXPath("Добавить в 
избранное"));
  private SelenideElement favoriteButton = 
$(byXPath("//a[@title='Избранное'"));
  
  public AdPage checkVisibleAdPage() {
    title.shouldBe(Condition.visible);
    return this;
  }

  public void addToFavoriteButtonClick() {
    addToFavoriteButton.should(Condition.visible).click();
  }

  public FavoritePage goToFavoritePage() {
    favoriteButton.shouldBe(Condition.visible).click();
    return new FavoritePage();
  }
}
