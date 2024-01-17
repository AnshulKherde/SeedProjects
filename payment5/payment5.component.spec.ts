import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Payment5Component } from './payment5.component';

describe('Payment5Component', () => {
  let component: Payment5Component;
  let fixture: ComponentFixture<Payment5Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Payment5Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Payment5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
