.class public final synthetic Lp6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/c$c;

.field public final synthetic k:Li9/y0;


# direct methods
.method public synthetic constructor <init>(Lp6/c$c;Li9/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/e;->j:Lp6/c$c;

    iput-object p2, p0, Lp6/e;->k:Li9/y0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/e;->j:Lp6/c$c;

    iget-object v1, p0, Lp6/e;->k:Li9/y0;

    invoke-static {v0, v1}, Lp6/c$c;->e(Lp6/c$c;Li9/y0;)V

    return-void
.end method
