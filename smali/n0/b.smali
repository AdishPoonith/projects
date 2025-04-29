.class public final synthetic Ln0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/d;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ln0/d;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/b;->j:Ln0/d;

    iput-object p2, p0, Ln0/b;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/b;->j:Ln0/d;

    iget-object v1, p0, Ln0/b;->k:Ljava/lang/Object;

    invoke-static {v0, v1}, Ln0/d;->d(Ln0/d;Ljava/lang/Object;)V

    return-void
.end method
