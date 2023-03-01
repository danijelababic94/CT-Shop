# Razlikovanje implicitnog i eksplicitnog "cekanja"

- Implicitno cekanje - primenjuje se na sve elemente u okviru projekta:
<br>
```JAVA
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
```
<br>
- Eksplicitno cekanje- primenjuje na jedan eksplicitan element u okiru projekta
<br>
```JAVA
    driver.get("https://www.ctshop.rs/");
    WebDriverWait webDriverWait =new WebDriverWait(driver,  30);
    webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Ceo dan kisa pada")));
    webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("Nadam se Suncu")));
    driver.findElement(By.cssSelector("danas je lep dan")).click();
```