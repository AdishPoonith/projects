.class final Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/b$a;,
        Ls1/b$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ls1/b$a;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ls1/b$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ls1/b;->a:Landroid/content/Context;

    new-instance p1, Ls1/b$a;

    invoke-direct {p1, p0, p2, p3}, Ls1/b$a;-><init>(Ls1/b;Landroid/os/Handler;Ls1/b$b;)V

    iput-object p1, p0, Ls1/b;->b:Ls1/b$a;

    return-void
.end method

.method static synthetic a(Ls1/b;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/b;->c:Z

    return p0
.end method


# virtual methods
.method public b(Z)V
    .locals 3

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Ls1/b;->c:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Ls1/b;->a:Landroid/content/Context;

    iget-object v0, p0, Ls1/b;->b:Ls1/b$a;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.media.AUDIO_BECOMING_NOISY"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x1

    :goto_0
    iput-boolean p1, p0, Ls1/b;->c:Z

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Ls1/b;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls1/b;->a:Landroid/content/Context;

    iget-object v0, p0, Ls1/b;->b:Ls1/b$a;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
