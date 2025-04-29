.class public Lj6/x0;
.super Lj6/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/x0$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj6/j;-><init>()V

    return-void
.end method

.method private s(Lcom/google/firebase/firestore/a0;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/a0;->f()Lcom/google/firebase/firestore/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/a0;->f()Lcom/google/firebase/firestore/j0;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/firestore/k0;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/a0;->f()Lcom/google/firebase/firestore/j0;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/k0;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/k0;->a()Lcom/google/firebase/firestore/l0;

    move-result-object p1

    instance-of p1, p1, Lcom/google/firebase/firestore/m0;

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method protected bridge synthetic a(Lj6/j$a;)Lp6/l;
    .locals 0

    invoke-virtual {p0, p1}, Lj6/x0;->r(Lj6/j$a;)Lp6/j;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lj6/j$a;)Lj6/p;
    .locals 1

    new-instance p1, Lj6/p;

    invoke-virtual {p0}, Lj6/j;->p()Lj6/f1;

    move-result-object v0

    invoke-direct {p1, v0}, Lj6/p;-><init>(Lj6/f1;)V

    return-object p1
.end method

.method protected c(Lj6/j$a;)Ll6/f4;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected d(Lj6/j$a;)Ll6/k;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected e(Lj6/j$a;)Ll6/i0;
    .locals 3

    new-instance v0, Ll6/i0;

    invoke-virtual {p0}, Lj6/j;->n()Ll6/e1;

    move-result-object v1

    new-instance v2, Ll6/f1;

    invoke-direct {v2}, Ll6/f1;-><init>()V

    invoke-virtual {p1}, Lj6/j$a;->e()Lh6/j;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Ll6/i0;-><init>(Ll6/e1;Ll6/f1;Lh6/j;)V

    return-object v0
.end method

.method protected f(Lj6/j$a;)Ll6/e1;
    .locals 3

    invoke-virtual {p1}, Lj6/j$a;->g()Lcom/google/firebase/firestore/a0;

    move-result-object v0

    invoke-direct {p0, v0}, Lj6/x0;->s(Lcom/google/firebase/firestore/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll6/o;

    new-instance v1, Lp6/l0;

    invoke-virtual {p1}, Lj6/j$a;->c()Lj6/m;

    move-result-object v2

    invoke-virtual {v2}, Lj6/m;->a()Lm6/f;

    move-result-object v2

    invoke-direct {v1, v2}, Lp6/l0;-><init>(Lm6/f;)V

    invoke-direct {v0, v1}, Ll6/o;-><init>(Lp6/l0;)V

    invoke-virtual {p1}, Lj6/j$a;->g()Lcom/google/firebase/firestore/a0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/a0;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll6/o0$b;->a(J)Ll6/o0$b;

    move-result-object p1

    invoke-static {p1, v0}, Ll6/y0;->o(Ll6/o0$b;Ll6/o;)Ll6/y0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ll6/y0;->n()Ll6/y0;

    move-result-object p1

    return-object p1
.end method

.method protected g(Lj6/j$a;)Lp6/p0;
    .locals 7

    new-instance v6, Lp6/p0;

    new-instance v1, Lj6/x0$b;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lj6/x0$b;-><init>(Lj6/x0;Lj6/x0$a;)V

    invoke-virtual {p0}, Lj6/j;->m()Ll6/i0;

    move-result-object v2

    invoke-virtual {p1}, Lj6/j$a;->d()Lp6/o;

    move-result-object v3

    invoke-virtual {p1}, Lj6/j$a;->a()Lq6/g;

    move-result-object v4

    invoke-virtual {p0}, Lj6/j;->i()Lp6/l;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lp6/p0;-><init>(Lp6/p0$c;Ll6/i0;Lp6/o;Lq6/g;Lp6/l;)V

    return-object v6
.end method

.method protected h(Lj6/j$a;)Lj6/f1;
    .locals 4

    new-instance v0, Lj6/f1;

    invoke-virtual {p0}, Lj6/j;->m()Ll6/i0;

    move-result-object v1

    invoke-virtual {p0}, Lj6/j;->o()Lp6/p0;

    move-result-object v2

    invoke-virtual {p1}, Lj6/j$a;->e()Lh6/j;

    move-result-object v3

    invoke-virtual {p1}, Lj6/j$a;->f()I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lj6/f1;-><init>(Ll6/i0;Lp6/p0;Lh6/j;I)V

    return-object v0
.end method

.method protected r(Lj6/j$a;)Lp6/j;
    .locals 1

    new-instance v0, Lp6/j;

    invoke-virtual {p1}, Lj6/j$a;->b()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lp6/j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
