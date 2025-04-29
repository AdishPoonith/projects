.class Lj6/x0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/p0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lj6/x0;


# direct methods
.method private constructor <init>(Lj6/x0;)V
    .locals 0

    iput-object p1, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj6/x0;Lj6/x0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/x0$b;-><init>(Lj6/x0;)V

    return-void
.end method


# virtual methods
.method public a(Lj6/z0;)V
    .locals 1

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj6/f1;->a(Lj6/z0;)V

    return-void
.end method

.method public b(I)Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj6/f1;->b(I)Ld6/e;

    move-result-object p1

    return-object p1
.end method

.method public c(ILi9/j1;)V
    .locals 1

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj6/f1;->c(ILi9/j1;)V

    return-void
.end method

.method public d(ILi9/j1;)V
    .locals 1

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj6/f1;->d(ILi9/j1;)V

    return-void
.end method

.method public e(Ln6/h;)V
    .locals 1

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj6/f1;->e(Ln6/h;)V

    return-void
.end method

.method public f(Lp6/k0;)V
    .locals 1

    iget-object v0, p0, Lj6/x0$b;->a:Lj6/x0;

    invoke-virtual {v0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj6/f1;->f(Lp6/k0;)V

    return-void
.end method
