var {test} = require('@playwright/test');

test("validate the login function " , async function({page}){

await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

await page.locator("//input[@name='username']").fill("Admin");

await page.locator("//input[@name='password']").fill("Admin123");

await page.pause();


})