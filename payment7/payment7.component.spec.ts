import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Payment7Component } from './payment7.component';

describe('Payment7Component', () => {
  let component: Payment7Component;
  let fixture: ComponentFixture<Payment7Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Payment7Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Payment7Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
