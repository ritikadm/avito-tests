import org.junit.Test;		

public class MyTest{
  @Test
  public void checkAddToFavorite() {
    
open("https://www.avito.ru/izhevsk/kvartiry/1-k._kvartira_34m_510et._3287600076");
    var adPage = new AdPage().checkVisibleAdPage();
    adPage.favoriteButtonClick();
    var favoritePage = 
adPage.goToFavoritepage().checkVisibleFavoritePage();
    favoritePage.checkAdVisible();
  }
}

