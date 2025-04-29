.class public final Lla/s;
.super Lla/x1;
.source "SourceFile"

# interfaces
.implements Lla/r;


# instance fields
.field public final n:Lla/t;


# direct methods
.method public constructor <init>(Lla/t;)V
    .locals 0

    invoke-direct {p0}, Lla/x1;-><init>()V

    iput-object p1, p0, Lla/s;->n:Lla/t;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lla/s;->n:Lla/t;

    invoke-virtual {p0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    invoke-interface {p1, v0}, Lla/t;->q(Lla/k2;)V

    return-void
.end method

.method public getParent()Lla/v1;
    .locals 1

    invoke-virtual {p0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/s;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method

.method public k(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lla/c2;->P(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
