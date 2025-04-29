.class final Lp3/y$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp3/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lp3/y;


# direct methods
.method private constructor <init>(Lp3/y;)V
    .locals 0

    iput-object p1, p0, Lp3/y$d;->a:Lp3/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lp3/y;Lp3/y$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp3/y$d;-><init>(Lp3/y;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {p1}, Lp3/y;->b(Landroid/content/Context;)I

    move-result p2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lp3/y$d;->a:Lp3/y;

    invoke-static {p1, p2}, Lp3/y$b;->a(Landroid/content/Context;Lp3/y;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp3/y$d;->a:Lp3/y;

    invoke-static {p1, p2}, Lp3/y;->c(Lp3/y;I)V

    :goto_0
    return-void
.end method
