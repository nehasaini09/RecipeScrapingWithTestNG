package com.recipescrapers.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.recipescrapers.base.BaseTest;
import com.recipescrapers.pageobj.PageObj;

public class RecipeTest extends BaseTest {
	PageObj page;

	@Test
	void scrapeRecipe() throws SQLException, TimeoutException, Exception, IOException {

		page = new PageObj(driver, wait);
		page.clickRecipeList();
		driver.navigate().refresh();
		page.removeAds();
		page.click_on_recipes_with_pagination();

	}
}