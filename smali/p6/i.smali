.class public final synthetic Lp6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/j;

.field public final synthetic k:Lp6/j$d;


# direct methods
.method public synthetic constructor <init>(Lp6/j;Lp6/j$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/i;->j:Lp6/j;

    iput-object p2, p0, Lp6/i;->k:Lp6/j$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp6/i;->j:Lp6/j;

    iget-object v1, p0, Lp6/i;->k:Lp6/j$d;

    invoke-static {v0, v1}, Lp6/j;->b(Lp6/j;Lp6/j$d;)V

    return-void
.end method
