.class final Lu4/n;
.super Lv4/s;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$j;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$j;)V
    .locals 0

    iput-object p2, p0, Lu4/n;->a:Lu4/c$j;

    invoke-direct {p0}, Lv4/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final I1(Lr4/b;)V
    .locals 2

    iget-object v0, p0, Lu4/n;->a:Lu4/c$j;

    new-instance v1, Lw4/l;

    invoke-direct {v1, p1}, Lw4/l;-><init>(Lr4/b;)V

    invoke-interface {v0, v1}, Lu4/c$j;->p(Lw4/l;)V

    return-void
.end method

.method public final b(Lr4/b;)V
    .locals 2

    iget-object v0, p0, Lu4/n;->a:Lu4/c$j;

    new-instance v1, Lw4/l;

    invoke-direct {v1, p1}, Lw4/l;-><init>(Lr4/b;)V

    invoke-interface {v0, v1}, Lu4/c$j;->y(Lw4/l;)V

    return-void
.end method

.method public final j1(Lr4/b;)V
    .locals 2

    iget-object v0, p0, Lu4/n;->a:Lu4/c$j;

    new-instance v1, Lw4/l;

    invoke-direct {v1, p1}, Lw4/l;-><init>(Lr4/b;)V

    invoke-interface {v0, v1}, Lu4/c$j;->U(Lw4/l;)V

    return-void
.end method
