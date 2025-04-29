.class public final synthetic Lw6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/storage/s;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/l;->j:Lcom/google/firebase/storage/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw6/l;->j:Lcom/google/firebase/storage/s;

    invoke-static {v0}, Lcom/google/firebase/storage/s;->f(Lcom/google/firebase/storage/s;)V

    return-void
.end method
