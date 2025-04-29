.class public final synthetic Ln0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/q;


# direct methods
.method public synthetic constructor <init>(Ln0/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/l;->j:Ln0/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln0/l;->j:Ln0/q;

    invoke-static {v0}, Ln0/q;->n(Ln0/q;)V

    return-void
.end method
