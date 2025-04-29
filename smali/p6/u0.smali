.class public final synthetic Lp6/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic k:Lp6/v0$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/u0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lp6/u0;->k:Lp6/v0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/u0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lp6/u0;->k:Lp6/v0$a;

    invoke-static {v0, v1}, Lp6/v0;->a(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V

    return-void
.end method
