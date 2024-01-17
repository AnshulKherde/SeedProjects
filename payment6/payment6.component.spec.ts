import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Payment6Component } from './payment6.component';

describe('Payment6Component', () => {
  let component: Payment6Component;
  let fixture: ComponentFixture<Payment6Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Payment6Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Payment6Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
