.class public final synthetic Lp6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp6/c$c;


# direct methods
.method public synthetic constructor <init>(Lp6/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/d;->j:Lp6/c$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp6/d;->j:Lp6/c$c;

    invoke-static {v0}, Lp6/c$c;->f(Lp6/c$c;)V

    return-void
.end method
