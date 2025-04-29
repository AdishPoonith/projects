.class public final synthetic Lz2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lz2/p;


# direct methods
.method public synthetic constructor <init>(Lz2/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/n;->j:Lz2/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz2/n;->j:Lz2/p;

    invoke-static {v0}, Lz2/p;->v(Lz2/p;)V

    return-void
.end method
