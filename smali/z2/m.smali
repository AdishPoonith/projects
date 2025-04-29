.class public final synthetic Lz2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lz2/p$b;


# direct methods
.method public synthetic constructor <init>(Lz2/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/m;->j:Lz2/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz2/m;->j:Lz2/p$b;

    invoke-interface {v0}, Lz2/p$b;->b()V

    return-void
.end method
