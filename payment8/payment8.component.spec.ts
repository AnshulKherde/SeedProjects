import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Payment8Component } from './payment8.component';

describe('Payment8Component', () => {
  let component: Payment8Component;
  let fixture: ComponentFixture<Payment8Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Payment8Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Payment8Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
