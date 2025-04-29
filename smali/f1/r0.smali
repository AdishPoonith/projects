.class public final synthetic Lf1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0$b;


# instance fields
.field public final synthetic a:[Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:Lf1/q0$f;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;ILf1/q0$f;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/r0;->a:[Ljava/lang/String;

    iput p2, p0, Lf1/r0;->b:I

    iput-object p3, p0, Lf1/r0;->c:Lf1/q0$f;

    iput-object p4, p0, Lf1/r0;->d:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final b(Lp0/o0;)V
    .locals 4

    iget-object v0, p0, Lf1/r0;->a:[Ljava/lang/String;

    iget v1, p0, Lf1/r0;->b:I

    iget-object v2, p0, Lf1/r0;->c:Lf1/q0$f;

    iget-object v3, p0, Lf1/r0;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1, v2, v3, p1}, Lf1/q0$f;->a([Ljava/lang/String;ILf1/q0$f;Ljava/util/concurrent/CountDownLatch;Lp0/o0;)V

    return-void
.end method
