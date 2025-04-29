.class Lp6/j$c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lp6/j;


# direct methods
.method private constructor <init>(Lp6/j;)V
    .locals 0

    iput-object p1, p0, Lp6/j$c;->a:Lp6/j;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lp6/j;Lp6/j$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/j$c;-><init>(Lp6/j;)V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lp6/j$c;->a:Lp6/j;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lp6/j;->d(Lp6/j;Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lp6/j$c;->a:Lp6/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lp6/j;->d(Lp6/j;Z)V

    return-void
.end method
