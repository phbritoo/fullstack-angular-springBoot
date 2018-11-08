import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('app-root h1')).getText();
  }
  getExtratoContaComponent() {
    return element(by.css('app-extrato-conta'));
  }
  getLancamentosListComponent() {
    return element(by.css('app-lancamentos-list'));
  }
}
