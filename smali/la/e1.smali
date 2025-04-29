.class public final Lla/e1;
.super Lla/b2;
.source "SourceFile"


# instance fields
.field private final n:Lla/c1;


# direct methods
.method public constructor <init>(Lla/c1;)V
    .locals 0

    invoke-direct {p0}, Lla/b2;-><init>()V

    iput-object p1, p0, Lla/e1;->n:Lla/c1;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lla/e1;->n:Lla/c1;

    invoke-interface {p1}, Lla/c1;->b()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/e1;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
