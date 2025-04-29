.class public final synthetic Lcom/google/firebase/storage/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/storage/y$a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/storage/s;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/storage/m;->a:Lcom/google/firebase/storage/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/m;->a:Lcom/google/firebase/storage/s;

    check-cast p1, Lcom/google/android/gms/tasks/OnCanceledListener;

    check-cast p2, Lcom/google/firebase/storage/s$a;

    invoke-static {v0, p1, p2}, Lcom/google/firebase/storage/s;->c(Lcom/google/firebase/storage/s;Lcom/google/android/gms/tasks/OnCanceledListener;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method
