.class public final synthetic Lp3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp3/y;

.field public final synthetic k:Lp3/y$c;


# direct methods
.method public synthetic constructor <init>(Lp3/y;Lp3/y$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/x;->j:Lp3/y;

    iput-object p2, p0, Lp3/x;->k:Lp3/y$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp3/x;->j:Lp3/y;

    iget-object v1, p0, Lp3/x;->k:Lp3/y$c;

    invoke-static {v0, v1}, Lp3/y;->a(Lp3/y;Lp3/y$c;)V

    return-void
.end method
