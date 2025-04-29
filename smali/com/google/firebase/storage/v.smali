.class public final synthetic Lcom/google/firebase/storage/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/storage/y;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/y;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/storage/v;->j:Lcom/google/firebase/storage/y;

    iput-object p2, p0, Lcom/google/firebase/storage/v;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/v;->j:Lcom/google/firebase/storage/y;

    iget-object v1, p0, Lcom/google/firebase/storage/v;->k:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/google/firebase/storage/y;->a(Lcom/google/firebase/storage/y;Ljava/lang/Object;)V

    return-void
.end method
