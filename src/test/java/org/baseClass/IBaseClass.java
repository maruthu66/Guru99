package org.baseClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public interface IBaseClass {
	public void browserLaunch(String url)throws Throwable;
	public void browserClose();
	public void sendKeyss(WebElement e,String value);
	public void sendKeyss(String value,WebElement e);
	public void sendKeyss(String value,WebElement e,int i);
	public void handleWindows();
	public void handleAlert();
	public void takeScreenShot(String value,WebElement e)throws Throwable;
	public void scrollDown(WebElement value);
	public void switchFrame();
	public void mouseAction(WebElement value);

}
