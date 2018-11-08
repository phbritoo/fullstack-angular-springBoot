import { AppPage } from './app.po';

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Extrato da conta corrente');
  });

  it('should display extrato page', () => {
    page.navigateTo();
    expect(page.getExtratoContaComponent()).toBeTruthy();
  });

  it('should display lancamentos list', () => {
    page.navigateTo();
    expect(page.getLancamentosListComponent()).toBeTruthy();
  });

});
