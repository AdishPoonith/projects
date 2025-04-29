.class public final synthetic Lp6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/c$c;

.field public final synthetic k:Li9/j1;


# direct methods
.method public synthetic constructor <init>(Lp6/c$c;Li9/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/f;->j:Lp6/c$c;

    iput-object p2, p0, Lp6/f;->k:Li9/j1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/f;->j:Lp6/c$c;

    iget-object v1, p0, Lp6/f;->k:Li9/j1;

    invoke-static {v0, v1}, Lp6/c$c;->h(Lp6/c$c;Li9/j1;)V

    return-void
.end method
