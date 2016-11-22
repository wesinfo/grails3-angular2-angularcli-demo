import { PurchasePage } from './app.po';

describe('purchase App', function() {
  let page: PurchasePage;

  beforeEach(() => {
    page = new PurchasePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
