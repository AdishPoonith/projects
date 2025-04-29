.class public La8/c;
.super Lq/e;
.source "SourceFile"


# instance fields
.field private final k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La8/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La8/d;)V
    .locals 1

    invoke-direct {p0}, Lq/e;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La8/c;->k:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;Lq/c;)V
    .locals 0

    iget-object p1, p0, La8/c;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/d;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, La8/d;->b(Lq/c;)V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    iget-object p1, p0, La8/c;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, La8/d;->a()V

    :cond_0
    return-void
.end method
