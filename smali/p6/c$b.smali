.class Lp6/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic j:Lp6/c;


# direct methods
.method constructor <init>(Lp6/c;)V
    .locals 0

    iput-object p1, p0, Lp6/c$b;->j:Lp6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lp6/c$b;->j:Lp6/c;

    invoke-static {v0}, Lp6/c;->f(Lp6/c;)V

    return-void
.end method
