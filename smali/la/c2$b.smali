.class final Lla/c2$b;
.super Lla/b2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lla/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final n:Lla/c2;

.field private final o:Lla/c2$c;

.field private final p:Lla/s;

.field private final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lla/c2;Lla/c2$c;Lla/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lla/b2;-><init>()V

    iput-object p1, p0, Lla/c2$b;->n:Lla/c2;

    iput-object p2, p0, Lla/c2$b;->o:Lla/c2$c;

    iput-object p3, p0, Lla/c2$b;->p:Lla/s;

    iput-object p4, p0, Lla/c2$b;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lla/c2$b;->n:Lla/c2;

    iget-object v0, p0, Lla/c2$b;->o:Lla/c2$c;

    iget-object v1, p0, Lla/c2$b;->p:Lla/s;

    iget-object v2, p0, Lla/c2$b;->q:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lla/c2;->u(Lla/c2;Lla/c2$c;Lla/s;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/c2$b;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
